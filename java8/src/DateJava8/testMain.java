package DateJava8;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalQuery;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.*;

public class testMain {
    public static void main(String[] args) {

        Date now=new Date();
        DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy年MM月dd日");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

        // 新建一个线程池
        ExecutorService pool = Executors.newFixedThreadPool(10);

        // 处理
        Callable<LocalDate> task = new Callable<LocalDate>() {
            @Override
            public LocalDate call() throws Exception {
                //return sdf.parse("2018年01月20日");
                LocalDate l=LocalDate.parse("2018年01月20日",format);
                return l;
                //return format.parse("2018年01月20日",LocalDate::from);
            }
        };

        // 存储集合
        List<Future<LocalDate>> results = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            results.add(pool.submit(task));
        }

        results.forEach((e) -> {
            try {
                //System.out.println(e.get());
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });

        // 关闭线程池
        pool.shutdown();
    }
    /**
     * 之所以要使用 final 方法，可能是出于对两方面理由的考虑。第一个是为方法
     * “上锁”，防止任何继承类改变它的本来含义。设计程序时，若希望一个方法的
     * 行为在继承期间保持不变，而且不可被覆盖或改写，就可以采取这种做法。
     * 采用 final 方法的第二个理由是程序执行的效率。将一个方法设成 final 后，
     * 编译器就可以把对那个方法的所有调用都置入“嵌入”调用里。只要编译器发现
     * 一个 final 方法调用，就会（根据它自己的判断）忽略为执行方法调用机制而采
     * 取的常规代码插入方法（将自变量压入堆栈；跳至方法代码并执行它；跳回来；
     * 清除堆栈自变量；最后对返回值进行处理）。相反，它会用方法主体内实际代码
     * 的一个副本来替换方法调用。这样做可避免方法调用时的系统开销。当然，若方
     * 法体积太大，那么程序也会变得雍肿，可能受到到不到嵌入代码所带来的任何性
     * 能提升。因为任何提升都被花在方法内部的时间抵消了。Java 编译器能自动侦测
     * 这些情况，并颇为“明智”地决定是否嵌入一个 final 方法。然而，最好还是不
     * 要完全相信编译器能正确地作出所有判断。通常，只有在方法的代码量非常少，
     * 或者想明确禁止方法被覆盖的时候，才应考虑将一个方法设为 final。
     * 类内所有 private 方法都自动成为 final。由于我们不能访问一个 private 方法，
     * 所以它绝对不会被其他方法覆盖（若强行这样做，编译器会给出错误提示）。可
     * 为一个 private 方法添加 final 指示符，但却不能为那个方法提供任何额外的含义。
     */
}

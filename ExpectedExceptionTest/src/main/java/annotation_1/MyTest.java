package annotation_1;

/**
 * Created by wangzhen on 2019-09-04
 */
public class MyTest {

    //进行获取注解方法的全部数据
    @MyAnnotation
    public void mytestLoad() {
        System.out.println("测试加载");
    }
    @MyAnnotation
    public void mytestRequest() {
        System.out.println("测试请求");
    }
    @MyAnnotation
    public void mytestProgress() {
        System.out.println("测试进度");
    }
    @MyAnnotation
    public void mytestError() {
        System.out.println(1 );
    }
    ///////该方法不执行
    public void mytestNoAnno(){
        System.out.println("没有注解的方法");
    }
}

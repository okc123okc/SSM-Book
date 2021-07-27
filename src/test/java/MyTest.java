/**
 * @Package: PACKAGE_NAME
 * @ClassName: MyTest
 * @Description:
 * @Author: okc
 * @Date: 2021/7/27 10:27
 * @Version 1.8
 **/

public class MyTest {
    public static void main(String[] args) {
        int  b[][]={{1}, {2,2}, {2,2,2}};
        int sum=0;

        for(int i=0;i<b.length;i++) {
            for(int j=0;j<b[i].length;j++) {
                sum+=b[i][j];
            }
        }
    }
}

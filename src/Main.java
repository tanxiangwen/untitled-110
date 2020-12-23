import java.util.Scanner;

public class Main {
    private static final int TRY_MAX=3;
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        LoginService loginService=new LoginService();
        System.out.println("------------------------------------------");
        System.out.println("-------欢迎使用视频管理系统-------------------");
        System.out.println("------------------------------------------");
        System.out.println("");
        //登录
        boolean isLogin=false;
        for(int i=1;i<TRY_MAX;i++){
            System.out.println("请输入用户名：");
            String username=scanner.nextLine();
            System.out.println("请输入密码：");
            String userpwd=scanner.nextLine();
            isLogin=loginService.login(username,userpwd);
            if(isLogin){
                break;

            }
            else{
                System.out.println("密码不正确 还有"+(TRY_MAX-1)+"次机会！");
            }
        }
        if(isLogin){
            VideoManager.showMenu();
        }

        System.out.println("------------------------------------------");
        System.out.println("-------谢谢使用视频管理系统-------------------");
        System.out.println("------------------------------------------");
        System.out.println("");
    }
}
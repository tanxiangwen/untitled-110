import java.util.Scanner;

public class VideoManager {
    private static final Scanner scanner = new Scanner(System.in);
    private static final VideoService videoService = new VideoService();

    public static void showMenu() {
        String choice;
        do {
            try {
                System.out.println("---------视频管理⼦菜单--------");
                System.out.println("- 模糊查询视频 \t选择 1");
                System.out.println("- 查询全部视频 \t选择 2");
                System.out.println("- 添加视频 \t选择 3");
                System.out.println("- 修改视频 \t选择 4");
                System.out.println("- 删除视频 \t选择 5");
                System.out.println("- 结束 \t选择 0");
                System.out.println("-------------------------------");
                System.out.println("请输⼊选项：");
                choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        System.out.println("请输⼊视频名称：");
                        String name = scanner.nextLine();
                        videoService.searchByName(name);
                        break;
                    case "2":
                        videoService.printlnAll();
                        break;
                    case "3":
                        addVideo();
                        break;
                    case "4":
                        updateVideo();
                        break;
                    case "5":
                        deleteVideo();
                        break;
                    case "0":
                        return;
                    default:
                        System.out.println("请输⼊正确的选项！");
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("请输⼊正确的选项！");
            }
        } while (true);
    }

    private static void deleteVideo() {
        System.out.println("请输入你要删除视频的编号：");
        long id = scanner.nextLong();
        scanner.nextLine();
        Video video = videoService.getById(id);
        if (video == null) {
            System.out.println("无效ID");
            return;
        }
        videoService.deleteVideo(id);
        System.out.println("编号为" + id + "视频信息为" + video + "已删除");
    }

    private static void updateVideo() {
        System.out.println("请输入你要修改的视频编号：");
        long id = scanner.nextLong();
        scanner.nextLine();
        Video video = videoService.getById(id);
        if (video == null) {
            System.out.println("无效ID");
            return;
        }
        System.out.println("编号为" + id + "视频信息为：" + video);
        System.out.println("请输入你的名字：");
        String name = scanner.nextLine();
        System.out.println("请输入演员：");
        String actors = scanner.nextLine();
        System.out.println("请输入简介：");
        String content = scanner.nextLine();
        videoService.updateVideo(id, name, actors, content);


    }

    private static void addVideo() {
        System.out.println("请输入编号：");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.println("请输入名字：");
        String name = scanner.nextLine();
        System.out.println("请输入演员：");
        String actors = scanner.nextLine();
        System.out.println("请输入简介：");
        String content = scanner.nextLine();
        videoService.addVideo(id, name, actors, content);


    }
}
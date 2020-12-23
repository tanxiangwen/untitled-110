import java.util.ArrayList;
import java.util.List;

public class VideoService implements IvideoService {
    private static List<Video> videoList=new ArrayList<Video>();

    @Override
    public void printlnAll() {
        videoList.forEach(video -> System.out.println(video));
    }

    @Override
    public void searchByName(String name) {
        videoList.stream().filter(video -> video.getName().contains(name)).forEach(System.out::println);

    }

    @Override
    public Video getById(long id) {
        for(Video video:videoList){
            if(video.getId()==id){
                return video;
            }
        }
        return null;
    }

    @Override
    public void addVideo(long id, String name, String actors, String content) {
        if(this.getById(id)==null){
            videoList.add(new Video(id,name,actors,content));
        }
    }

    @Override
    public void deleteVideo(long id) {
        Video video =this.getById(id);
        if(video!=null){
            videoList.remove(video);
        }
    }

    @Override
    public void updateVideo(long id, String name, String actors, String content) {
        Video video =this.getById(id);
        if(video!=null){
            video.setName(name);
            video.setActors(actors);
            video.setContent(content);
        }
    }
}


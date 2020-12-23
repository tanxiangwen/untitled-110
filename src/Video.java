public class Video {
    private long id;

    /** 名字 */
    private String name;

    /** 演员 */
    private String actors;

    /** 简介 */
    private String content;

    public Video( long id,String name,String actors,String content){
        this.id=id;
        this.name=name;
        this.actors=actors;
        this.content=content;
    }
    public void setId(long id){
        this.id=id;
    }
    public long getId(){
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }
    public String getActors(){
        return actors;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getContent(){
        return content;
    }
    public String toString(){
        return  "编号" + id + "\t名称：" + name + "\t演员：" +actors + "\t简介：" +content;
    }
}

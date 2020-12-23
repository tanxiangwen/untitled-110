public  interface IvideoService {
    public void printlnAll();//打印所有
    public void searchByName(String name);//按照名字查找
     public Video getById(long id);//按照id查找
    public void addVideo(long id,String name,String actors,String content);//添加
    public void deleteVideo(long id);//删除
    public void updateVideo(long id,String name,String actors,String content);//更新

}

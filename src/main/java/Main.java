public class Main {
    public static void main(String[] args) {
        Viewer viewer = new Viewer();
        CinemaApplicationRun cinemaApplicationRun = new CinemaApplicationRun();
        ViewerStatistics viewerStatistics = new ViewerStatistics();
        cinemaApplicationRun.listLoading();
        viewerStatistics.averageAge(viewer.nickName, viewer.age);
    }
}
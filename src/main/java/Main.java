public class Main {
    public static void main(String[] args) {
        CinemaApplicationRun cinemaApplicationRun = new CinemaApplicationRun();
        ViewerStatistics viewerStatistics = new ViewerStatistics();
        cinemaApplicationRun.listLoading();
        viewerStatistics.averageAge();
    }
}
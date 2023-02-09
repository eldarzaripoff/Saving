import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        File savegames = new File("C://Users//Эльдар//OneDrive//Рабочий стол//Games//GunRunner//savegames");
        if (savegames.mkdirs())
            System.out.println("Folder is created");

        GameProgress gameProgress1 = new GameProgress(1, 1, 1, 1);
        GameProgress gameProgress2 = new GameProgress(5, 5, 5, 5);
        GameProgress gameProgress3 = new GameProgress(10, 10, 10, 10);

        String path1 = "C://Users//Эльдар//OneDrive//Рабочий стол//Games//GunRunner//savegames//save1.dat";
        String path2 = "C://Users//Эльдар//OneDrive//Рабочий стол//Games//GunRunner//savegames//save2.dat";
        String path3 = "C://Users//Эльдар//OneDrive//Рабочий стол//Games//GunRunner//savegames//save3.dat";
        gameProgress1.saveGame(path1, gameProgress1);
        gameProgress2.saveGame(path2, gameProgress2);
        gameProgress3.saveGame(path3, gameProgress3);

        String pathForZip = "C://Users//Эльдар//OneDrive//Рабочий стол//Games//GunRunner//savegames//zip.zip";
        List<String> filePaths = new ArrayList<>();
        filePaths.add(path1);
        filePaths.add(path2);
        filePaths.add(path3);

        gameProgress1.zipFiles(pathForZip, filePaths);

    }


}


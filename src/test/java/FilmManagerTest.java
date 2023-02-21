import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.FilmManager;

public class FilmManagerTest {
    FilmManager manager = new FilmManager();

    @Test
    public void shouldAddMovie() {
        manager.addFilm("Test Film");
        manager.addFilm("Test Film 2");
        manager.addFilm("Test Film 3");

        String[] expected = {"Test Film", "Test Film 2", "Test Film 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindoverLimit() {
        FilmManager manager = new FilmManager(15);

        manager.addFilm("Test Film");
        manager.addFilm("Test Film 2");
        manager.addFilm("Test Film 3");

        String[] expected = {"Test Film 3", "Test Film 2", "Test Film"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }
    @Test
    public void testFindLessLimit(){
        manager.addFilm("Test Film");
        manager.addFilm("Test Film 2");
        manager.addFilm("Test Film 3");
        manager.addFilm("Test Film 4");
        manager.addFilm("Test Film 5");
        manager.addFilm("Test Film 6");
        manager.addFilm("Test Film 7");
        manager.addFilm("Test Film 8");
        manager.addFilm("Test Film 9");
        manager.addFilm("Test Film 10");
        manager.addFilm("Test Film 11");

        String[] expected = {"Test Film 11", "Test Film 10", "Test Film 9", "Test Film 8", "Test Film 7", "Test Film 6", "Test Film 5", "Test Film 4", "Test Film 3", "Test Film 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected,actual);



    }
    @Test
    public void testFind() {
        manager.addFilm("Test Film");
        manager.addFilm("Test Film 2");
        manager.addFilm("Test Film 3");

        String[] expected = {"Test Film 3", "Test Film 2", "Test Film"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }


}

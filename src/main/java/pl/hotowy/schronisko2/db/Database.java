package pl.hotowy.schronisko2.db;

import org.springframework.stereotype.Repository;
import pl.hotowy.schronisko2.model.Pet;
import pl.hotowy.schronisko2.model.Type;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Database {

    private List<Pet> database = new ArrayList<>();

    public Database() {
        database.add(new Pet("Szarik","Piekny, mlody, inteligentny piesek specjalizujacy sie w kryptografii i analizie logiki rozmytej", Type.DOGS, "http://www.tapeta-piesek-okulary-beeagle.na-pulpit.com/zdjecia/piesek-okulary-beeagle.jpeg"));
        database.add(new Pet("Takko","Szary, bury,piekny kotek ze snajperka w gratisie!", Type.CATS, "http://slodkie-kociaki.blog.onet.pl/wp-content/blogs.dir/506241/files/blog_in_811255_1588271_tr_kociak_strzela.jpg"));
        database.add(new Pet("Macintosh","Cybermyszka o nieludzkich umiejętnosciach !", Type.OTHER, "https://i.pinimg.com/736x/cd/6c/85/cd6c8513ca55932365d78180f831e7ad.jpg"));
        database.add(new Pet("Snoop","Niby dog, ale nie do końca", Type.OTHER, "https://i.ytimg.com/vi/836as-nLydE/maxresdefault.jpg"));
        database.add(new Pet("PacificatorX","Nie zadzieraj z tym typem! Jest strasznie niebezpieczny!", Type.DOGS, "http://www.sickchirpse.com/wp-content/uploads/2017/02/Dog-GUn.jpg"));
    }

    public List<Pet> getDatabase() {
        return database;
    }
}

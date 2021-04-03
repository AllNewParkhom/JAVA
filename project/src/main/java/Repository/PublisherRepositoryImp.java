package Repository;

import com.project.project.domain.Publisher;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class PublisherRepositoryImp implements PublisherRepository {
    private List<Publisher> data = Arrays.asList(
            new Publisher("AST", "Moscow, ploshad lenina 1", 2322444, new HashSet<>()),
            new Publisher("Bukva", "Moscow, krasnaya ploshad 99", 2322555, new HashSet<>()),
            new Publisher("VR", "Vrn, lizukova 11", 2322666, new HashSet<>())
    );

    @Override
    public List<Publisher> findAll() {
        return data;
    }


    @Override
    public void add(Publisher publisher) {
        data.add(publisher);
    }

    @Override
    public void delete(Publisher publisher) {
        data.removeIf(curr -> Objects.equals(curr.getUid(), publisher.getUid()));

    }


    @Override
    public Publisher findByUid(UUID uuid) {
        return data.stream().filter(curr -> Objects.equals(curr.getUid(), uuid)).findFirst().orElse(null);
    }
}

package dznine.projectdb.repository;

import dznine.projectdb.entity.Logs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogsRepository extends JpaRepository<Logs, Integer> {
    @Query("select logs from Logs logs where logs.components.id = ?1")
    List<Logs> getByComponents(Integer id);

    @Override
    List<Logs> findAll();

    @Override
    <S extends Logs> S save(S s);

}

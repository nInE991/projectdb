package dznine.projectdb.repository;

import dznine.projectdb.entity.Logs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogsRepository extends JpaRepository<Logs, Integer> {
    @Modifying
    @Query("select new Logs (componets.id, componets.name, Sum(logs.count)) from Logs logs left join Components componets on logs.components.id =componets.id group by componets.id, componets.name")
    List<Logs> findAll();

}

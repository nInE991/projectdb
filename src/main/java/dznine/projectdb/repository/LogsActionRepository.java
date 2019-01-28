package dznine.projectdb.repository;

import dznine.projectdb.entity.LogsActions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogsActionRepository extends JpaRepository<LogsActions, Integer> {
    @Override
    LogsActions getOne(Integer integer);
}

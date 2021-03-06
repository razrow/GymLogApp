package com.daclink.drew.gymlog.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.daclink.drew.gymlog.GymLog;

import java.util.List;

@Dao
public interface GymLogDAO {

    @Insert
    void insert(GymLog... gymLogs);

    @Update
    void update(GymLog... gymLogs);

    @Delete
    void delete(GymLog gymLog);

    @Query("SELECT * FROM " + AppDatabase.GYMLOG_TABLE + " Order BY mDate DESC")
    List<GymLog> getGymLogs();

    @Query("SELECT * FROM " + AppDatabase.GYMLOG_TABLE + " WHERE mLogId = :logId")
    List<GymLog> getGymLogsById(int logId);
}

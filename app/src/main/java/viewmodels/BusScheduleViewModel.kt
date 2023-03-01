/*Ahmed Ben Abdesselem*/
package viewmodels

import androidx.lifecycle.ViewModel
import com.example.busschedule.database.Schedule
import com.example.busschedule.database.ScheduleDao

class BusScheduleViewModel(private val scheduleDao: ScheduleDao): ViewModel() {
    fun fullSchedule(): List<Schedule> = scheduleDao.getAll()

    fun scheduleForStopName(name: String): List<Schedule> = scheduleDao.getByStopName(name)
}
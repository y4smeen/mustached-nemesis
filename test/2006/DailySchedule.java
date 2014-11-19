public class DailySchedule{
    private ArrayList apptList;
    public DailySchedule(){
	apptList = new ArrayList();
    }
    public void clearConflicts(Appointment appt){
	for (int i = 0; i < apptList.size; i++){
	    if (apptList.get(i).conflictsWith(appt)){
		apptList.remove(i);
	    }
	}
    }
}

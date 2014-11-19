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
    public boolean addAppt(Appointment appt, boolean emergency){
	for (int i = 0; i < apptList.size; i++){
	    if (apptList.get(i).conflictsWith(appt)){
		if (emergency == true){
		    clearConflicts(appt);
		    apptList.add(appt);
		}
		else{
		    return false;
		}
	    }
	}
	apptList.add(appt);
	return true;
}

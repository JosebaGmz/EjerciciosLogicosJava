class Badge {
    public String print(Integer id, String name, String department) {
        String msg;

        if(department == null && id == null){
            msg = name + " - OWNER";
        } else if(department == null){
            msg = "[" +id + "] - " + name + " - OWNER";
        }else if (id == null){
            msg = name + " - " + department.toUpperCase();
        }else{
            msg = "[" + id + "] - " + name + " - " + department.toUpperCase();
        }


        return msg;
    }
}

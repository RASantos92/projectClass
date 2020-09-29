class Project {
    private String name;
    private String description;
    public Project(){
    }
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    // getter
    public String getDescription() {
        return description;
    }
    
    // setter
    public void setDescription(String description) {
        description = description;
    }
    // getter
    public String getName() {
        return name;
    }
    // setter
    public void setName(String name) {
        this.name = name;        // 1
    }
    public void elevatorPitch(Project project){
        System.out.println("Name: " + project.getName() + " Description: " + project.getDescription());
    }
}
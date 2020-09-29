class ProjectTest {
    public static void main(String[] args) {
        Project p = new Project();
        Project project1 = new Project("Military Facebook", "A social media site for military personal");
        System.out.println("Project name: " + project1.getName() + " Description: " + project1.getDescription());
        
        Project project2 = new Project("Subaway");
        System.out.println("project2 name: " + project2.getName());

        Project project3 = new Project();

        p.elevatorPitch(project1);
    }
}
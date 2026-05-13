class campus{
    public static void main(String[] args){
        
        Course course1 = new Course("Math 511", 10, "Mr John");
        Course course2 = new Course("Programming 700", 15, "Mrs Doe");
        
        course1.display();
        course2.display();
        
    }
}

class Course{
    String courseName;
    int credits;
    String lecturer;
    
    Course(String courseName, int credits, String lecturer){
        this.courseName = courseName;
        this.credits = credits;
        this.lecturer = lecturer;
    }
    
    void display(){
        System.out.println("Course: " + courseName + "\nCredits: " + credits + "\nLecturer: " + lecturer);
    }
    
    
}

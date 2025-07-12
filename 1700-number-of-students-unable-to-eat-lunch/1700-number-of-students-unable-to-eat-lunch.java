class Solution {
public int countStudents(int[] studentsArr, int[] sandwiches) {
    Queue<Integer> students = new LinkedList<>();
    for (int s : studentsArr) {
        students.offer(s);
    }

    int index = 0; 
    int count = 0;  

    while (!students.isEmpty()) {
        if (students.peek() == sandwiches[index]) {
            students.poll();   
            index++;           
            count = 0;         
        } else {
            students.offer(students.poll()); 
            count++; 
        }

        if (count == students.size()) break;
    }

    return students.size(); 
}

}
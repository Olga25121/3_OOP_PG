package HW.hw_3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        TrainingStream trainingStream = new TrainingStream();
        trainingStream.addStudyGroup(new StudyGroup("Group-1", 287, "Продакт-менеджеры"));
        trainingStream.addStudyGroup(new StudyGroup("Group-2", 233, "Проджект-менеджеры"));
        trainingStream.addStudyGroup(new StudyGroup("Group-3", 184, "Аналитики"));
        trainingStream.addStudyGroup(new StudyGroup("Group-4", 265, "Программисты"));
        trainingStream.addStudyGroup(new StudyGroup("Group-5", 221, "Тестировщики"));

        //выведем как есть
        System.out.println("До сортировки------------------------\n");

        for (StudyGroup item : trainingStream){
            System.out.println(item.toString());
        }

        //отсортируем 1 методом
        trainingStream.Sort1();


        Iterator<StudyGroup> iterator = trainingStream.iterator();
        System.out.println("\nСортировка 1 методом------------------------\n");
        
        while (iterator.hasNext()){
            StudyGroup sg = iterator.next();
            System.out.println(sg.toString());
        }

        
        //отсортируем 2 методом
        trainingStream.Sort2();


        iterator = trainingStream.iterator();
        System.out.println("\nСортировка 2 методом------------------------\n");
        while (iterator.hasNext()){
            StudyGroup sg = iterator.next();
            System.out.println(sg.toString());
        }

    }
}

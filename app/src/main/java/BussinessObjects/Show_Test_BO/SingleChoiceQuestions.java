package BussinessObjects.Show_Test_BO;

import java.util.ArrayList;

/**
 * Created by Muhammad Taimoor on 7/4/2017.
 */

public class SingleChoiceQuestions {
    private int id;
    private String title;
    private int test_id;
    private int marks;
    private int std_answer;
    private ArrayList<Single_Choice_Options> options;

    public SingleChoiceQuestions(int id, String title, int test_id, int marks, int std_answer, ArrayList<Single_Choice_Options> options) {
        this.id = id;
        this.title = title;
        this.test_id = test_id;
        this.marks = marks;
        this.std_answer = std_answer;
        this.options = options;
    }

    public SingleChoiceQuestions() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTest_id() {
        return test_id;
    }

    public void setTest_id(int test_id) {
        this.test_id = test_id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getStd_answer() {
        return std_answer;
    }

    public void setStd_answer(int std_answer) {
        this.std_answer = std_answer;
    }

    public ArrayList<Single_Choice_Options> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<Single_Choice_Options> options) {
        this.options = options;
    }
}

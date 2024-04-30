package Seminars.OOPLesson_7.workshop.task_3;

public class DocumentAdapter implements Document {
    OldDocument oldDocument = new OldDocument();

    @Override
    public void openDocument(){
        oldDocument.openDocument();
    };

    @Override
    public void closeDocument(){
        oldDocument.closeDocument();
    };

    
}
package Lectures.lec_2.Ex006.Interface;

import Lectures.lec_2.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}

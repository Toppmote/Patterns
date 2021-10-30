package adapter;

import lombok.Getter;
import lombok.Setter;

/**
 * Класс, описывающий PDF-файл
 */
@Getter
public class PdfFile {

    /**
     * Название файла
     */
    @Setter
    private String title;

    /**
     * Содержимое файла
     */
    private String content;

    /**
     * Размер файла в байтах
     */
    private int size;

    public PdfFile(String title, String content) {
        this.title = title;
        this.content = content;
        this.size = this.computeSize(content);
        System.out.println("PDF file \"" + title + "\" has been created");
    }

    /**
     * Метод вычисления размера файла
     *
     * @param content содерджимое файла
     * @return размер в байтах
     */
    private int computeSize(String content) {
        return content.length() * 2;
    }

    /**
     * Метод задания содержимого файла. При задании также пересчитываем размер
     *
     * @param content новое содержимое
     */
    public void setContent(String content) {
        this.content = content;
        this.size = this.computeSize(content);
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getSize() {
        return size;
    }
}

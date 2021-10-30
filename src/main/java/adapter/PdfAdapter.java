package adapter;

import lombok.Setter;
import systemClasses.messageContent.MessageContent;

import java.util.Objects;

/**
 * Класс-адаптер для PDF файла
 */
public class PdfAdapter implements MessageContent {

    /**
     * PDF файл
     */
    @Setter
    private PdfFile adaptable;

    public PdfAdapter(PdfFile adaptable) {
        this.adaptable = adaptable;
        System.out.println("PDF adapter has been initialized with PDF file");
    }

    public PdfAdapter() {
        this.adaptable = null;
        System.out.println("PDF adapter has been initialized without PDF file");
    }

    @Override
    public int getContentHashCode() {
        return Objects.hash(adaptable.getTitle(), adaptable.getContent(), adaptable.getSize());
    }
}
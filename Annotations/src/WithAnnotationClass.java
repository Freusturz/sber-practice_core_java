import lombok.NonNull;

@DayWeek(dayOfTheWeek = 2)
public class WithAnnotationClass extends BaseClass {
    @Plan(hours = 11, precedence = -1, specification = "Возвращает текст с аннотацией")
    @Plan(hours = 16)
    @Plan(hours = 21, precedence = 1)
    public void setData(@NonNull String specification) {

        this.container.setSpecification(specification);

    }
}
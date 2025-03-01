package code;

import code.resolvers.*;

import java.util.ArrayList;
import java.util.List;

public enum Questions {

    Q1(List.of(
            "Это+трудовые+отношения,+основанные+на+устной+договорённости+без+заключения+письменного+трудового+договора.",
            "Это+вид+деятельности,+связанный+с+производством+и+распространением+запрещенных+законом+товаров,+работ+и+услуг",
            "Это+вид+деятельности,+целью+которого+является+сокращение+или+уход+от+налогообложения"), 1140620244, Type.SINGLE, DefaultResoulver.INSTANCE),
    Q2(List.of(
            "Да,+работал+на+постоянной+работе",
            "Да,+подрабатывал+в+свободное+от+учебы+время",
            "Нет,+не+работал",
            "Работаю+в+данный+момент"), 961213716, Type.SINGLE, DefaultResoulver.INSTANCE),
    Q3(List.of(
            "Фриланс",
            "Работа+без+официального+трудового+договора",
            "Собственный+бизнес",
            "Участие+в+проектах/консультациях",
            "Работа+в+интернете/телемаркетинг",
            "Работа+с+официальным+трудовым+договором"), 1409795320, Type.SINGLE, Q3Resolver.INSTANCE),
    Q4(List.of(
            "Менее+5+часов",
            "От+5+до+10+часов",
            "От+11+до+20+часов",
            "От+21+до+30+часов",
            "От+31+до+40+часов"), 1222976689, Type.SINGLE, DefaultResoulver.INSTANCE),
    Q5(List.of(
            "100%+времени+на+учебу,+не+работаю",
            "75%+времени+на+учебу,+25%+на+работу/подработку",
            "50%+времени+на+учебу,+50%+на+работу",
            "25%+времени+на+учебу,+75%+на+работу",
            "100%+времени+на+работу,+не+учусь"), 674950305, Type.SINGLE, Q5Resolver.INSTANCE),
    Q6(List.of(
            "Улучшение+материального+благополучия",
            "Получение+опыта+работы,+близкого+к+образованию",
            "Интерес,+новые+знакомства,+способ+самореализации",
            "Свободный+график+работы",
            "Студенту+тяжело+найти+официальную+работу",
            "Помогал+(а)+родственникам/знакомым"), 145309184, Type.MULTIPART, DefaultResoulver.INSTANCE),
    Q7(List.of(
            "Никогда+не+прекращал(а)+работу+во+время+учебы",
            "Прекращал(а)+работу+на+время+сессии/экзаменов",
            "Прекращал(а)+работу+на+летние+каникулы",
            "Прекращал(а)+работу+из-за+высокой+учебной+нагрузки",
            "Прекращал(а)+работу+из-за+несовместимости+графика+работы+и+учебы",
            "Прекращал(а)+работу+по+семейным+обстоятельствам",
            "Прекращал(а)+работу+из-за+низкой+заработной+платы",
            "Прекращал(а)+работу+из-за+конфликтов+с+руководством/коллегами",
            "Прекращал(а)+работу,+так+как+она+не+соответствовала+моим+интересам/квалификации"), 2108921988, Type.MULTIPART, FirstOrAllResolver.INSTANCE),
    Q8(List.of(
            "Неформальная+занятость+не+оказывает+влияния+на+мои+учебные/карьерные+перспективы",
            "Из-за+неформальной+занятости+у+меня+меньше+возможностей+для+дальнейшего+обучения",
            "Моя+неформальная+работа+дает+мне+необходимый+опыт+для+дальнейшего+карьерного+роста",
            "Неформальная+занятость+мешает+моему+карьерному+росту+из-за+отсутствия+официального+трудового+стажа",
            "Нестабильный+доход+от+неформальной+работы+не+позволяет+мне+планировать+дальнейшее+обучение",
            "Неформальная+занятость+дает+мне+гибкий+график,+что+помогает+совмещать+работу+и+учебу",
            "Неформальная+работа+не+связана+с+моей+специальностью,+поэтому+не+влияет+на+карьерные+перспективы"), 189682382, Type.MULTIPART, FirstOrAllResolver.INSTANCE),
    Q9(List.of(
            "Коммуникативные+навыки,+умение+общаться+с+людьми",
            "Способность+работать+в+команде",
            "Навыки+планирования+и+управления+временем",
            "Клиентоориентированность,+умение+работать+с+клиентами",
            "Стрессоустойчивость",
            "Навыки+продаж,+переговоров",
            "Креативное+мышление,+способность+находить+нестандартные+решения",
            "Умение+быстро+обучаться+новым+навыкам",
            "Самодисциплина+и+ответственность",
            "Практические+профессиональные+навыки,+связанные+с+моей+специальностью",
            "Никаких+новых+навыков+не+приобрел(а)"), 2084509882, Type.MULTIPART, LastOrAllResolver.INSTANCE),
    Q10(List.of(
            "Абсолютно+исключено,+только+официальное+трудоустройство",
            "Вряд+ли,+постараюсь+найти+официальную+работу",
            "Пока+не+определился(ась)",
            "Возможно,+если+не+удастся+устроиться+официально",
            "Да,+планирую+работать+неофициально"), 301939009, Type.SINGLE, DefaultResoulver.INSTANCE),
    Q11(List.of(
            "Желание+получать+официальную+заработную+плату+и+социальные+гарантии",
            "Опасения+штрафов+и+санкций+за+незаконное+трудоустройство",
            "Стремление+к+уважению+закона+и+прозрачности+трудовых+отношений",
            "Необходимость+отчислений+в+пенсионный+фонд+для+будущей+пенсии",
            "Перспективы+карьерного+роста+и+стабильности+при+официальном+трудоустройстве",
            "Возможность+взять+кредит,+ипотеку+при+наличии+официального+дохода",
            "Планы+на+получение+рабочей+визы/вида+на+жительство+в+другой+стране",
            "Никакие+соображения+не+заставят,+готов(а)+работать+неофициально"), 471629410, Type.MULTIPART, Q11Resoulver.INSTANCE),
    Q12(List.of(
            "17-19",
            "20-22",
            "23-25",
            "26-28",
            "29+и+старше"), 1906532425, Type.SINGLE, DefaultResoulver.INSTANCE),
    Q13(List.of(
            "Бакалавриат",
            "Магистратура",
            "Специалитет",
            "Аспирантура"), 2085748021, Type.SINGLE, Q13Resoulver.INSTANCE),
    Q14(List.of(
            "1",
            "2",
            "3",
            "4",
            "5"), 43197203, Type.SINGLE, Q14Resoulver.INSTANCE),
    Q15(List.of(
            "Уфа",
            "Братск",
            "Москва",
            "Москва",
            "Москва",
            "Москва",
            "Москва",
            "Москва",
            "Москва",
            "Москва",
            "Москва",
            "Новосибирск",
            "Иркутск",
            "Санкт-Петербург",
            "Челябинск", "Екатеринбург", "Тюмень", "Омск", "Воронеж", "Волгоград", "Красноярск", "Чебоксары", "Воронеж", "Ростов-на-Дону"),1983747863, Type.SINGLE, DefaultResoulver.INSTANCE);

    Questions(List<String> variant, int number, Type type, Resoulver resoulver) {
        this.resoulver = resoulver;
        this.type = type;
        this.variant = variant;
        this.number = number;
    }

    public void resoulve(List<Response> allMessage){
        resoulver.apply(allMessage, this);
    }

    public List<String> variant;
    public Type type;
    public Resoulver resoulver;
    public int number;
}

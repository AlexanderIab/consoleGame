package consoleGame.gameLogic;

/**
 * @author Alexander Iablonski
 * */
public class ParagraphInitialization {
        Paragraph LookForLittleSquirrelAlone = new Paragraph("""
                Лисёнок слишком долго плутал по лесу в поисках друга и сам не заметил,
                как заблудился. Теперь его самого нужно искать. Игра завершилась неудачей""", true);
        Paragraph BackHome = new Paragraph("""
                Вернувшись домой, Лисёнок нашёл там Бельчонка.
                Оказалось, что Бельчонок пришёл на место встречи раньше и увидел там рой злобных пчел.
                Он поспешил предупредить об этом Лисёнка, но они разминулись.
                Наконец-то друзья нашли друг друга! Игра завершилась успехом""", true);
        Paragraph EatAndRest = new Paragraph("""
                Пока Лисёнок ел, злобные пчёлы вернулись и покусали его.
                Лисёнку нужна помощь, он не сможет продолжить поиски. Игра завершилась неудачей""", true);
        Paragraph BringHoneyToLittleBear = new Paragraph("""
                Довольный Медвежонок рассказал Лисёнку, что очень хорошо знает семью Белок и уверен,
                что Бельчонок никогда не пошёл бы в глубь леса. Он заверял Лисёнка,
                что Белки не попадают в неприятности, и что Совам нельзя верить,
                он также уговаривал Лисёнка вернуться домой.
                1.\tМедвежонок ничего не знает, нужно продолжить поиски -> Искать Бельчонка в одиночку
                2.\tМожет быть он прав и Лисёнок просто паникует -> Вернуться домой
                Для выбора команды введите 1 или 2. Для выхода в Меню введите 3.
                """, LookForLittleSquirrelAlone, BackHome, false);
        Paragraph WaitForBees = new Paragraph("""
                Лисёнок подождал немного, и пчёлы разлетелись. Лисёнок без проблем набрал мёда.
                Вдруг он понял, что очень голоден. Что же делать?
                1.\tПоесть немного и передохнуть
                2.\tСкорее отнести мёд Медвежонку
                Для выбора команды введите 1 или 2. Для выхода в Меню введите 3.
                """, EatAndRest, BringHoneyToLittleBear, false);
        Paragraph TryStealHoney = new Paragraph("""
                Это была не лучшая идея. Пчёлы покусали Лисёнка,
                теперь ему самому нужна помощь.
                Игра завершилась неудачей""", true);
        Paragraph GetHoney = new Paragraph("""
                Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел.
                Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.
                1.\tПодождать, вдруг пчёлы улетят
                2.\tНужно попытаться выкрасть мёд немедленно
                Для выбора команды введите 1 или 2. Для выхода в Меню введите 3.
                """, WaitForBees, TryStealHoney, false);
        Paragraph BelieveOwl = new Paragraph("""
                В глубине леса Лисёнок встретил Медвежонка. Ленивый Медвежонок был готов рассказать все,
                что знает, если Лисёнок принесёт ему мёда.
                1.\tНет, потрачено слишком много времени, нужно идти дальше -> Искать Бельчонка в одиночку
                2.\tНужно воспользоваться шансом и раздобыть мёд
                Для выбора команды введите 1 или 2. Для выхода в Меню введите 3.
                """, LookForLittleSquirrelAlone, GetHoney, false);
        Paragraph AskOwl = new Paragraph("""
                Сова долго не хотела говорить, но в итоге сказала, что видела испуганного Бельчонка,
                бежавшего вглубь леса. Все лесные жители знают, что в глубине леса опасно,
                если Бельчонок там, ему срочно нужна помощь.
                1.\tПоверить Сове и отправиться вглубь леса
                2.\tСове не стоит верить -> Искать Бельчонка в одиночку
                Для выбора команды введите 1 или 2. Для выхода в Меню введите 3.
                """, BelieveOwl, LookForLittleSquirrelAlone, false);
        Paragraph AskWolf = new Paragraph("""
                Волк оказался вполне дружелюбным, но помочь не смог.
                Лишь сказал, что маленькому лисенку не стоит бродить по лесу одному.
                И как теперь поступить?
                1.\tВолк прав -> Вернуться домой
                2.\t-> Искать Бельчонка в одиночку
                Для выбора команды введите 1 или 2. Для выхода в Меню введите 3.
                """, BackHome, LookForLittleSquirrelAlone, false);
        Paragraph FindOutAboutLittleSquirrel = new Paragraph("""
                Пока Лисёнок принимал решение, лесные жители разошлись кто куда. Остались только Сова и Волк.
                Но у Совы бывают проблемы с памятью, а Волк может сильно разозлиться из-за расспросов. Кого выбрать?
                1.\tРасспросить Сову
                2.\tРасспросить Волка
                Для выбора команды введите 1 или 2. Для выхода в Меню введите 3.
                """, AskOwl, AskWolf, false);

        Paragraph GoSearch = new Paragraph("""
                Все лесные жители были заняты своими делами и не обращали внимания на Лисёнка и его проблему.
                Но вдруг кто нибудь видел Бельчонка... Лисёнок не знал, что ему делать. Помогите ему.
                1.\tПопытаться разузнать о Бельчонке у лесных жителей
                2.\tИскать Бельчонка в одиночку
                Для выбора команды введите 1 или 2. Для выхода в Меню введите 3.
                """, FindOutAboutLittleSquirrel, LookForLittleSquirrelAlone, false);
        Paragraph LittleFoxAppStart = new Paragraph("""
                Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком.
                Это утро не было исключением. Лисёнок пришёл на их обычное место встречи,
                но Бельчонка там не было. Лисёнок ждал, ждал, но так и не смог дождаться своего друга.
                " Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду." - подумал Лисёнок.
                Как поступить Лисенку?
                1.\tВернуться домой
                2.\tОтправиться на поиски
                Для выбора команды введите 1 или 2. Для выхода в Меню введите 3.
                """, BackHome, GoSearch, false);

    public Paragraph getLittleFoxAppStart() {
        return LittleFoxAppStart;
    }
}

#### Console game

User interaction is implemented through the console.
The menu is implemented using the Command pattern, where each menu item is a separate command.

Menu:
1. Start the game
2. Download the game
3. Exit

After the game starts, it is possible to exit to the menu, and a new item 'Save game' appears in the menu.

When the user selects 'Save Game', the state of the game is saved to a file and restored when 'Load Game' is selected.

#### Titles, text of paragraph and answer options below (in Russian):

Лисенок

Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком. Это утро не было исключением. Лисёнок пришёл на их обычное место встречи, но Бельчонка там не было. Лисёнок ждал, ждал, но так и не смог дождаться своего друга. " Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду." - подумал Лисёнок. Как поступить Лисенку?

-Вернуться домой
-Отправиться на поиски

Вернуться домой

Вернувшись домой, Лисёнок нашёл там Бельчонка. Оказалось, что Бельчонок пришёл на место встречи раньше и увидел там рой злобных пчел. Он поспешил предупредить об этом Лисёнка, но они разминулись. Наконец-то друзья нашли друг друга! Игра завершилась успехом

Отправиться на поиски

Все лесные жители были заняты своими делами и не обращали внимания на Лисёнка и его проблему. Но вдруг кто нибудь видел Бельчонка... Лисёнок не знал, что ему делать. Помогите ему.

-Попытаться разузнать о Бельчонке у лесных жителей
-Искать Бельчонка в одиночку

Попытаться разузнать о Бельчонке у лесных жителей

Пока Лисёнок принимал решение, лесные жители разошлись кто куда. Остались только Сова и Волк. Но у Совы бывают проблемы с памятью, а Волк может сильно разозлиться из-за расспросов. Кого выбрать?

-Расспросить Сову
-Расспросить Волка

Искать Бельчонка в одиночку

Лисёнок слишком долго плутал по лесу в поисках друга и сам не заметил, как заблудился. Теперь его самого нужно искать. Игра завершилась неудачей

Расспросить Сову

Сова долго не хотела говорить, но в итоге сказала, что видела испуганного Бельчонка, бежавшего вглубь леса. Все лесные жители знают, что в глубине леса опасно, если Бельчонок там, ему срочно нужна помощь.

-Поверить Сове и отправиться вглубь леса
-Сове не стоит верить -> Искать Бельчонка в одиночку

Расспросить Волка

Волк оказался вполне дружелюбным, но помочь не смог. Лишь сказал, что маленькому лисенку не стоит бродить по лесу одному. И как теперь поступить?

-Волк прав -> Вернуться домой
--> Искать Бельчонка в одиночку

Поверить Сове и отправиться вглубь леса

В глубине леса Лисёнок встретил Медвежонка. Ленивый Медвежонок был готов рассказать все, что знает, если Лисёнок принесёт ему мёда.

-Нет, потрачено слишком много времени, нужно идти дальше -> Искать Бельчонка в одиночку
-Нужно воспользоваться шансом и раздобыть мёд

Нужно воспользоваться шансом и раздобыть мёд

Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел. Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.

-Подождать, вдруг пчёлы улетят
-Нужно попытаться выкрасть мёд немедленно

Подождать, вдруг пчёлы улетят

Лисёнок подождал немного, и пчёлы разлетелись. Лисёнок без проблем набрал мёда. Вдруг он понял, что очень голоден. Что же делать?

-Поесть немного и передохнуть
-Скорее отнести мёд Медвежонку

Нужно попытаться выкрасть мёд немедленно

Это была не лучшая идея. Пчёлы покусали Лисёнка, теперь ему самому нужна помощь. Игра завершилась неудачей

Поесть немного и передохнуть

Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. Лисёнку нужна помощь, он не сможет продолжить поиски. Игра завершилась неудачей

Скорее отнести мёд Медвежонку

Довольный Медвежонок рассказал Лисёнку, что очень хорошо знает семью Белок и уверен, что Бельчонок никогда не пошёл бы в глубь леса. Он заверял Лисёнка, что Белки не попадают в неприятности, и что Совам нельзя верить, он также уговаривал Лисёнка вернуться домой.

-Медвежонок ничего не знает, нужно продолжить поиски -> Искать Бельчонка в одиночку
-Может быть он прав и Лисёнок просто паникует -> Вернуться домой

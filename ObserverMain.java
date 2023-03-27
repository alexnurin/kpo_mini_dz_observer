public class ObserverMain {
    public static void main(String[] args) {
        Game game1 = new Game();
        Game game2 = new Game();
        Game game3 = new Game();

        game1.addObserver(new Journalist("Matthew B."));
        game2.addObserver(new Journalist("KiberDwizh"));
        game3.addObserver(new Journalist("Matther B."));
        game3.addObserver(new Journalist("Matther B."));

        game1.addObserver(new Player("Alex"));
        game1.addObserver(new Player("Nurin"));
        game2.addObserver(new Player("Bob"));
        game3.addObserver(new Player("Jack"));

        game1.addObserver(new Developer("Mr. Robbins"));
        game2.addObserver(new Developer("Mr. Dobbins"));
        game2.addObserver(new Developer("Mr. Hobbins"));
        game3.addObserver(new Developer("Ms. Stan"));

        game1.newGame("BioShock",
                "Мастер, Убийца, Бог машин",
                "шутер от первого лица, действие которого происходит в заброшенном подводном городе Восторг — утопии, созданной для того, чтобы дать возможность самым светлым умам и элитам вырваться из-под государственного контроля и мирно развиваться без какого-либо внешнего влияния",
                "8 GB, E6750 Core 2 Duo (2,66 ГГц) / AMD Athlon X2, GeForce GTX 670");
        game2.newGame("Watch Dogs Legion",
                "Хакер, Друг, Выживший, Крестоносец",
                "Антиутопический Лондон недалёкого будущего — мрачный, серый и дождливый с вооружёнными патрулями, митингами, арестами и повсюду летающими дронами",
                "16 GB, GeForce RTX 3080, Intel Core i9-9900K / AMD Ryzen 7 3700X");
        game3.newGame("Cyberpunk 2077",
                "Киберпсих, Возмездие, Новое начало, Абсурд",
                "Приключенческая ролевая игра, действие которой происходит в мегаполисе Найт-Сити, где власть, роскошь и модификации тела ценятся выше всего",
                "8 GB, Intel Core i5-3570K / AMD FX-8310, GTX 780");
    }
}
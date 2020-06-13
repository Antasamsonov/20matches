public class Messages {
    ComputerLogic computerLogic = new ComputerLogic();


    public void start(){
        System.out.println("Игра началась!");
        System.out.println("На столе находится 20 спичек.");
        System.out.println("Ход компьютера. Количество выбранных компьютером спичек = 3");
        System.out.println("На столе осталось 17 спичек.");
    }
    public void howMuch(int numb){
        System.out.println("На столе осталось " + numb + " спичек.");
    }
    public void compMove(int numb){
        System.out.println("Ход компьютера. Количество выбранных компьютером спичек = " + computerLogic.computerMove(numb));
    }
    public void playerMove(){
        System.out.println("Ход игрока. Введите количество выбранных спичек: ");
    }
    public void error(){
        System.out.println("Некорректное количество спичек. Выберите от 1 до 3 спичек.");
    }
    public void end(){
        System.out.println("Для игрока осталась последняя спичка. Игра окончена! Вы проиграли!");
    }
}

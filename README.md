## Задание 1. Радиоман (обязательное к выполнению)
В рамках проекта по созданию "Умного дома" у нас появился очень важный клиент, которых хочет кастомную доработку: он очень любит радио, поэтому нам нужно научиться управлять радио.

Что нужно сделать: по аналогии с кондиционером создайте класс Radio, в котором храните следующие поля (т.е. данные, которые будут помнить о себе объекты радио):

Номер текущей (прослушиваемой) радиостанции
Громкость звука
Требования к работе с радиостанциями:

Номер текущей радиостанции может принимать значения только в пределах от 0 до 9
Если текущая радиостанция - 9 и клиент нажал на кнопку next (=вызвал одноимённый метод next, с англ. следующая) на пульте, то текущей должна стать 0-ая; в остальных случаях при нажатии на эту же кнопку радио переключается просто на следующую станцию.
Если текущая радиостанция - 0 и клиент нажал на кнопку prev (=вызвал одноимённый метод prev, с англ. предыдущая) на пульте, то текущей должна стать 9-ая; в остальных случаях радиопереключается просто на предыдущую станцию.
Клиент должен иметь возможность выставлять номер радиостанции через прямое указание её номера (для этого подойдёт один метод-сеттер с проверкой на допустимость номера станции)
Требования к работе с уровнем громкости звука:

Клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука (в пределах от 0 до 10)
Если уровень громкости звука достиг максимального значения, то дальнейшее нажатие на + (=вызов метода увеличения громкости на один, придумайте название сами) не должно ни к чему приводить
Если уровень громкости звука достиг минимального значения, то дальнейшее нажатие на - (=вызов метода уменьшения громкости на один, придумайте название сами) не должно ни к чему приводить
Пример реализации метода увеличения звука на 1 (остальные методы переключения на 1 текущей станции или звука сделайте самостоятельно по аналогии):
```
public class Radio {
  ...
  
  public void increaseVolume() {
    if (currentVolume < 10) {
      currentVolume = currentVolume + 1;
    }
  }
}
````
# Результат

При отправке решения в личном кабинете прикрепите ссылку на ваш публичный гитхаб-репозиторий.

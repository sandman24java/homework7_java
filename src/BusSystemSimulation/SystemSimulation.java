package BusSystemSimulation;

import java.util.*;

public class SystemSimulation {
    public static void main(String[] args)  {
        Bus bus = new Bus();
        bus.add_passengers(Stops.getPassengers_of_stop1());
        Stops.display_passengers_on_stop(Stops.getPassengers_of_stop1());
        bus.move_to_next_stop();


        bus.remove_passengers();
        bus.add_passengers(Stops.getPassengers_of_stop2());
        Stops.display_passengers_on_stop(Stops.getPassengers_of_stop2());
        bus.move_to_next_stop();


        bus.remove_passengers();
        bus.add_passengers(Stops.getPassengers_of_stop3());
        Stops.display_passengers_on_stop(Stops.getPassengers_of_stop3());
        bus.getBusList();


























        // Автобус доезжает до остановок
        // Пассажиры садятся по очереди, причем некоторые садятся и сходят первыми по приоритету
        // это пожилые, инвалиды, беременные
        // на каждой остановке ждет один лист из из пассажиров (Queue или LinkedList)
        // на каждой остановке может быть макс 10 человек
        // у каждого человека есть 2 параметра name и isPriority(Boolean)
        // в автобус могут войти 5 человек максимум
        // автобус подъезжает к остановкам и происходит следующее
        // по рандому выходят  1 2 человека
        // те кто ждут на остановке садятся
        // если есть isPriority== true он садится первым
        // симуляция останавливается после 3 остановок и показываются пассажиры в автобусе
        // и кто остался на каждой из остановок
        //

    }
}

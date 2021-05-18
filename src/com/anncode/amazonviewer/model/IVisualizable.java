package com.anncode.amazonviewer.model;

import java.util.Date;

public interface IVisualizable {

    /**
     *Este método captura el tiempo exacto de inicio de visualización
     * @param dateI Es un objeto {@code Date} con el tiempo de inicio exacto.
     * @return Return of date and hour exact.
     */
    Date startToSee(Date dateI);

    /**
     * This method capture the start time and the final time, exact.
     * @param dateI It is an object {@code Date} with the start exact time.
     * @param dateF It is an object {@code Date} with the final axact time
     */
    void stopToSee(Date dateI, Date dateF);

}

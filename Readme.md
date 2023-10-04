# TAREA TIEMPO ACTIVA

En esta tarea hemos realizado una aplicacion, que nos muestre en el **Logcat** cuanto tiempo ha estado activa, una vez esta entra en pausa
Para ello hemos seguido unos sencillos pasos:

Nuevas funciones
---

**System.currentTimeMillis()** Esto obtiene el tiempo **ACTUAL**en milisegundos
por lo que hemos creado **2** variables, una al inicio de la aplicación, en la funcion **onStart** 
que obtiene el tiempo actual en milisegundos y lo guarda en nuestra variable

        startTime = System.currentTimeMillis()

Queremos obtener este tiempo cuando la aplicacion entra en Pausa, por lo que 
dentro de la funcion **onPause()** debemos obtener el tiempo actual en ms

        var endTime: Long = System.currentTimeMillis()

Una vez hecho esto, **¿CÓMO OBTENEMOS EL TIEMPO QUE HA ESTADO ACTIVA LA APLICACIÓN?**
Bien, pues es muy sencillo, solo debemos **restar** del tiempo de inicio de la aplicación, el tiempo actual en el que entra en estdo de pausa,
esto nos devolverá cuanto tiempo ha estado activa la aplicación.

            totalTimeActive =  endTime - startTime


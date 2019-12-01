package mx.edu.ittepic.tpdm_u4_u5_practica2_kevinalexisvillegas





import android.graphics.Canvas
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View
import android.widget.Toast

class Lienzo(p:MainActivity): View(p) {
    var puntero = p
    var imagenTec = Imagen(this, -80f, -420f, R.drawable.tecnologico490)
    var ed_ud = Imagen(this, 630f, 1280f, R.drawable.ed_ud)
    var ed_cb = Imagen(this, 250f, 1380f, R.drawable.ed_cb)
    var ed_uvp = Imagen(this, -50f, 1370f, R.drawable.ed_uvp)
    var ed_lc = Imagen(this, 255f, 1300f, R.drawable.ed_lc)
    var ed_liia = Imagen(this, 30f, 1100f, R.drawable.ed_liia)
    var ed_s= Imagen(this,440f,1050f,R.drawable.ed_sistemas)
    var ed_k=Imagen(this,440f,996f,R.drawable.ed_k)
    var ed_ad=Imagen(this,652f,1020f,R.drawable.ed_admin)
    var ed_f=Imagen(this,280f, 996f,R.drawable.ed_ef)
    var ed_j=Imagen(this,400f, 896f,R.drawable.ed_jo)
    var ed_cle=Imagen(this,790f,930f,R.drawable.ed_cl)
    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()
        imagenTec.pintar(c)
        ed_ud.pintar(c)
        ed_cb.pintar(c)
        ed_uvp.pintar(c)
        ed_lc.pintar(c)
        ed_liia.pintar(c)

        ed_s.pintar(c)
        ed_k.pintar(c)
        ed_ad.pintar(c)
        ed_f.pintar(c)
        ed_j.pintar(c)
        ed_cle.pintar(c)


    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        when(event.action){
            MotionEvent.ACTION_DOWN -> {
                if(ed_ud.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. UD: Dep. de Sistemas e Industrial y cuenta con diversos salones ", Toast.LENGTH_LONG).show()
                }

                if(ed_cb.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. CB: Imparten clases de Ciencias Básicas", Toast.LENGTH_LONG).show()
                }

                if(ed_uvp.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. UVP: Oficinas de Residencias y servicio social, además imparten clases de ingles", Toast.LENGTH_LONG).show()
                }

                if(ed_lc.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. LC: Laboratorio de computo, taller de redes", Toast.LENGTH_LONG).show()
                }

                if(ed_liia.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. LIIA: Laboratorio de algo:c, dicen que tiene los baños de Hotel", Toast.LENGTH_LONG).show()
                }
                if(ed_s.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. Aqui se encuentra la Cafeteria ", Toast.LENGTH_LONG).show()
                }
                if(ed_k.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. K:Cafeteria y oficinas  ", Toast.LENGTH_LONG).show()
                }
                if(ed_ad.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. Ad: Administrativo en el segundo piso direccion ", Toast.LENGTH_LONG).show()
                }
                if(ed_f.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. UD: F Se encuentran los talleres de Electrica y Civil ", Toast.LENGTH_LONG).show()
                }
                if(ed_j.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. J: Salones de Mecatronica y arquitectura ", Toast.LENGTH_LONG).show()
                }
                if(ed_cle.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. cl: Bibloteca ", Toast.LENGTH_LONG).show()
                }
            }

        }
        return true
    }

}

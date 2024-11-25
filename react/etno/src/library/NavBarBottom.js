import React from 'react'

import SkipL from './../media/pages/noticias/skip-left-noticia.svg'
import SkipR from './../media/pages/noticias/skip-right-noticia.svg'

export function NavBarBottom() {
    return(
        <div className="pagination">
            <a href="#">
                <img src={SkipL} alt='Skip Left'></img>
            </a>
            <a href="#" className="active">1</a>
            <a href="#">2</a>
            <a href="#">3</a>
            <a href="#">4</a>
            <a href="#">5</a>
            <a href="#">
                <img src={SkipR} alt='Skip Rigth'></img>
            </a>
        </div>
    )
}
import React from "react"
import ImgF from './../media/pages/posts/img1_face.jpg'

function defineTipo(tipo) {
    switch (tipo){
        case 1:
            return "Facebook"
            break;
        case 2:
            return "Instagram"
            break;
        case 3:
            return "Curiosidades"
            break;
        default:
            return 'Post'
            break;
    }
}

export function Postagem(tipo) {
    var tipoText = defineTipo(tipo);

    return (
        <a href="https://web.facebook.com/photo/?fbid=944571731009558&set=ecnf.100063702185886" target="_blank" className="cards buttonCards" >
            <div className="card-img">
                <img src={ImgF} alt="pessoas" className="facebook-post"></img>
            </div>
            <div className="main-desc-card">
                <div className="card-desc">
                    <span className="btn-divulgacao-card">{tipoText}</span>
                    <span className="dias-card">DD de MM</span>
                </div>
                <div className="card-desc-img">
                    <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Repudiandae.</p>
                </div>
            </div>
        </a>
    )
}
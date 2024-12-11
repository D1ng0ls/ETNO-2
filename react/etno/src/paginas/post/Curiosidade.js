import React, {useState} from "react";
import ImgF from './../../media/pages/posts/img1_face.jpg'

export function Curiosidade() {
    const [isCardOpen, setIsCardOpen] = useState(false);

    const abreCard = () => {
        setIsCardOpen(!isCardOpen);
    };

    return (
        <section className="social-media-posts" id="curiosidades">
            <p className="social-media-tittle-post">Curiosidades</p>
            <hr/>
            <div className="social-media-cards">
                <div class={`carde ${isCardOpen? 'cardAberto' : ''}`} onClick={abreCard} id="card11">
                    <div class="cards buttonCards">
                        <a href="https://www.ufmg.br/espacodoconhecimento/tecnologia-ancestral-africana-simbolos-adinkra/" target="_blank" class="card-img">
                            <img src={ImgF} alt="pessoas" class="facebook-post"></img>
                        </a>
                        <div class="main-desc-card">
                            <div class="card-desc">
                                <span class="btn-divulgacao-card">Curiosidades</span>
                                <span class="dias-card">16/08/2022</span>
                            </div>
                            <div class="card-desc-img">
                                <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Repudiandae.</p>
                            </div>
                        </div>
                    </div>
                    <div class={`fecha-card ${isCardOpen? 'aparece' : ''}`}>
                        <i className="bi bi-x"></i>
                    </div>
                </div>
            </div>
        </section>
    )
}
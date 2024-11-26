import React from 'react'
import ImgCipo from './../../media/pages/posts/background.png'

export function Home() {
    return (
        <>
            <section className="social-media-content">
                <p>Acompanhe nossas<br/>redes sociais</p>
                <div className="social-media-buttons">
                    <a href="https://web.facebook.com/ETNOBirigui/" target="_blank" className="btn-social-media facebook-button">
                        Acessar
                        <i className='bi bi-facebook'></i>                       
                    </a>
                    <a href="https://www.instagram.com/etnobirigui/" target="_blank" className="btn-social-media instagram-button">
                        Acessar
                        <i className='bi bi-instagram'></i>                       
                    </a>
                </div>
            </section>
            <section className="last-posts-content">
                <img src={ImgCipo} alt="cipó" className="cipo" id="cipo1"></img>
                <p>
                    <span>Últimas postagens</span>
                    <br/><br/>
                    <a href="#facebook-posts"  id="facebook-posts">
                        <i className='bi bi-arrow-down'></i>
                    </a>
                </p>
                <img src={ImgCipo} alt="cipó" className="cipo" id="cipo2"></img>
            </section>
        </>
    )
}

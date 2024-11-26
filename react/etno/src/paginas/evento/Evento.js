import React from "react";

import ImgE from './../../media/pages/eventos/evento-full-1.png'

export function EventoTexto() {
    return (
        <a href="https://www.instagram.com/p/ClCTtDnrzFx/" target="_blank" class="event-card">
            <div className="card-event">
                <div className="card-event2">DD<br/>MM</div>
                <div className="card-event3">
                    <h3>Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit?</h3>
                    <div>
                        <i className="bi bi-clock"></i>
                        <p>hh:mm até hh:mm</p>
                    </div>
                    <div>
                        <i className="bi bi-geo-alt"></i>
                        <p><span>Lorem ipsum dolor</span><br/>Lorem ipsum dolor sit amet consectetur adipisicing elit. Nobis, assumenda neque!</p>
                    </div>
                    <div>
                        <i className="bi bi bi-info-circle"></i>
                        <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. In, mollitia ex? Earum impedit explicabo voluptate, qui esse reprehenderit.</p>
                    </div>
                </div>
            </div>
            <img src={ImgE} alt="Evento 1"></img>
        </a>
    )
}

export function Evento() {
    return (
        <section className="events-section">
            <h2>Próximos eventos</h2>
            <div className="line-separator"></div>
            <div className="event-cards">
                {EventoTexto()}
                {EventoTexto()}
                {EventoTexto()}
                {EventoTexto()}
                {EventoTexto()}
                {EventoTexto()}
            </div>
        </section>
    )
}
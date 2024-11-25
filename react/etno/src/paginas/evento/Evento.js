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
                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-clock" viewBox="0 0 16 16">
                            <path d="M8 3.5a.5.5 0 0 0-1 0V9a.5.5 0 0 0 .252.434l3.5 2a.5.5 0 0 0 .496-.868L8 8.71z"/>
                            <path d="M8 16A8 8 0 1 0 8 0a8 8 0 0 0 0 16m7-8A7 7 0 1 1 1 8a7 7 0 0 1 14 0"/>
                        </svg>
                        <p>hh:mm até hh:mm</p>
                    </div>
                    <div>
                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-geo-alt" viewBox="0 0 16 16">
                            <path d="M12.166 8.94c-.524 1.062-1.234 2.12-1.96 3.07A32 32 0 0 1 8 14.58a32 32 0 0 1-2.206-2.57c-.726-.95-1.436-2.008-1.96-3.07C3.304 7.867 3 6.862 3 6a5 5 0 0 1 10 0c0 .862-.305 1.867-.834 2.94M8 16s6-5.686 6-10A6 6 0 0 0 2 6c0 4.314 6 10 6 10"/>
                            <path d="M8 8a2 2 0 1 1 0-4 2 2 0 0 1 0 4m0 1a3 3 0 1 0 0-6 3 3 0 0 0 0 6"/>
                        </svg>
                        <p><span>Lorem ipsum dolor</span><br/>Lorem ipsum dolor sit amet consectetur adipisicing elit. Nobis, assumenda neque!</p>
                    </div>
                    <div>
                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-list" viewBox="0 0 16 16">
                            <path fill-rule="evenodd" d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5m0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5m0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5"/>
                        </svg>
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
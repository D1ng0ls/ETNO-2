import React, { useState, useEffect } from 'react';
import {useLocation } from 'react-router-dom';

import logo from './../media/global/logo-branco.png';
import logo2 from './../media/global/logo-brown.svg';

function TrocaLogo() {
    const [logoHeader, setLogoHeader] = useState(logo);
    const location = useLocation();
  
    useEffect(() => {
        if (location.pathname === '/noticias' || location.pathname === '/eventos' || location.pathname === '/posts') {
            setLogoHeader(logo2);
        } else {
            setLogoHeader(logo);
        }
    }, [location.pathname]);
  
    return logoHeader;
}

export default function Header() {
    let logoAtual = TrocaLogo()

  return (
    
    <header className="header">
        <div className="header-logo">
            <a
                className="Header-link"
                href="/"
                rel="noopener noreferrer"
            >
                <img src={logoAtual} className="ETNO-logo" alt="logo" />
            </a>
        </div>
        <nav className="header-menu">
            <ul>
                <li>
                    <a
                        className="Header-link"
                        href="/"
                    >
                        Home
                    </a>
                </li>
                <li>
                    <a
                        className="Header-link"
                        href="noticias"
                    >
                        Notícias
                    </a>
                </li>
                <li>
                    <a
                        className="Header-link"
                        href="eventos"
                    >
                        Eventos
                    </a>
                </li>
                <li>
                    <a
                        className="Header-link"
                        href="posts"
                    >
                        Posts
                    </a>
                </li>
                <li>
                    <a
                        className="Header-link"
                        href="sobre"
                    >
                        Sobre
                    </a>
                </li>
                <li>
                    <a
                        className="Header-link"
                        href="faq"
                    >
                        FAQ
                    </a>
                </li>
            </ul>
        </nav>
        <div className="menu" onclick="burgermenu()">
            <i class="bi bi-list"></i>
        </div>
    </header>

  );
}
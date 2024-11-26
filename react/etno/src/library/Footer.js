import React from 'react'
import logo from './../media/global/logo-horizontal.svg';

export default function Footer() {
  return (
    <footer className="footer">
        <div className="foot-img">
            <a href="index.html">
                <img src={logo} alt="Logo"/>
            </a>
            </div>
            <div className="foot-text">
                <p>©2024 por Comissão ETNO - Birigui.</p>
                <div className="text-social">
                    <div className="icon instagram-icon">
                        <a href="https://www.instagram.com/etno_ifspbirigui" target="_blank">
                            <i class="bi bi-instagram"></i>
                        </a>    
                    </div>
                    <div className="icon facebook-icon">
                        <a href="https://www.facebook.com/ETNOBirigui" target="_blank">
                            <i class="bi bi-facebook"></i>
                        </a>
                    </div>
                </div>
            </div>
    </footer>
  );
}
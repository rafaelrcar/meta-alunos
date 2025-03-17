import { Component, AfterViewInit } from '@angular/core';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.scss'],
})
export class FooterComponent implements AfterViewInit {

  ngAfterViewInit(): void {
    this.setFooterAtTheBottom();
  }

  // Função que ajusta o rodapé para ficar no fundo da página
  setFooterAtTheBottom() {
    const footer = document.querySelector('footer');
    if (footer) {
      const parent = footer.parentElement;
      if (parent) {
        // Aplica o estilo ao elemento pai para garantir que o rodapé fique na parte inferior
        this.setElementStyles(parent, {
          display: 'flex',
          flexDirection: 'column',
          minHeight: '100vh', // Garantir que a altura mínima seja 100% da tela
        });

        // Aplica o estilo de rodapé para empurrá-lo para baixo
        this.setElementStyles(footer, {
          marginTop: 'auto', // Isso empurra o footer para o fundo
        });
      } else {
        console.error('Elemento pai do rodapé não encontrado');
      }
    } else {
      console.error('Elemento rodapé não encontrado');
    }
  }

  // Função auxiliar para definir os estilos de um elemento
  private setElementStyles(element: HTMLElement, styles: Record<string, string>) {
    Object.keys(styles).forEach((style) => {
      element.style[style as any] = styles[style];
    });
  }
}

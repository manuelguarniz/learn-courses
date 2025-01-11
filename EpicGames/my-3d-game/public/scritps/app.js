// app.js
import * as THREE from 'three';

// Crear la escena, cámara y renderer
const scene = new THREE.Scene();
const camera = new THREE.PerspectiveCamera(75, window.innerWidth / window.innerHeight, 0.1, 1000);
const renderer = new THREE.WebGLRenderer();
renderer.setSize(window.innerWidth, window.innerHeight);
document.body.appendChild(renderer.domElement);

// Agregar luz
const light = new THREE.PointLight(0xffffff, 1, 100);
light.position.set(10, 10, 10);
scene.add(light);

// Crear un objeto (el jugador)
const playerGeometry = new THREE.BoxGeometry();
const playerMaterial = new THREE.MeshStandardMaterial({ color: 0x00ff00 });
const player = new THREE.Mesh(playerGeometry, playerMaterial);
scene.add(player);

// Posicionar la cámara
camera.position.z = 5;

// Animación básica
function animate() {
  requestAnimationFrame(animate);
  renderer.render(scene, camera);
}
animate();

// Movimiento del jugador
const speed = 0.1;
window.addEventListener('keydown', (event) => {
  switch (event.key) {
    case 'ArrowUp':
      player.position.z -= speed;
      break;
    case 'ArrowDown':
      player.position.z += speed;
      break;
    case 'ArrowLeft':
      player.position.x -= speed;
      break;
    case 'ArrowRight':
      player.position.x += speed;
      break;
  }
});
